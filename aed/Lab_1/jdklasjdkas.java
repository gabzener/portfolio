package aed.actanotas;

import java.util.Comparator;
import java.util.function.Function;
import es.upm.aedlib.Pair;
import es.upm.aedlib.indexedlist.*;

public class ActaNotasImpl implements ActaNotas {
	
    private String asignatura;
	private double notaMinimaAprobado;
	private int anyo;
	private boolean esConvocatoriaExtraordinaria;
	private IndexedList<Calificacion> calificaciones;  
	
	public ActaNotasImpl(String asignatura, double notaMinimaAprobado,
	                     int anyo, boolean esConvocatoriaExtraordinaria){
		this.asignatura = asignatura;
		this.calificaciones = new ArrayIndexedList<Calificacion>();
	    this.notaMinimaAprobado = notaMinimaAprobado;
	    this.anyo = anyo;
	    this.esConvocatoriaExtraordinaria = esConvocatoriaExtraordinaria; 
	}
	
	public String asignatura() {
		return this.asignatura;
	}

	public int anyo() {
		return this.anyo;
	}
	
	 public boolean esConvocatoriaExtraordinaria() {
		return this.esConvocatoriaExtraordinaria;
	 }
	
	 public double minNotaAprobado() {
		 return this.notaMinimaAprobado;
	 }
	
		public ActaNotas addCalificacion(String nombre, String matricula, String grupo, double nota){
			
			 if (nombre == null || matricula == null || grupo == null || nota < 0.0 || nota > 10.0) 
			      throw new IllegalArgumentException();
			 
			 
			 if(getCalificacion(matricula)!=null) 
					throw new IllegalStateException();  
					
			 
			 Calificacion calif = new Calificacion(nombre,matricula,grupo,nota);
			 this.calificaciones.add(this.calificaciones.size(),calif);
			 insertionSort1(this.calificaciones);
			
			return this;
		}
		
		
		public Calificacion getCalificacion(String matricula) {
			if(matricula == null) 
				throw new IllegalArgumentException();
			
			int i = this.buscarMatricula(matricula);
			
			if(i==-1) 
				return null;
			
			 return this.calificaciones.get(i);
		}

		public ActaNotas updateCalificacion(Calificacion calificacion) {
			if(calificacion == null)
				throw new IllegalArgumentException();
			
		    int i = this.buscarMatricula(calificacion.matricula());
			
			if(i ==-1)
				throw new IllegalStateException();
			
			this.calificaciones.set(i,calificacion);
			return this;	
		}

		public ActaNotas deleteCalificacion(String matricula) {
			if(matricula == null)
				throw new IllegalArgumentException();
			
			int i = this.buscarMatricula(matricula);
			
			if(i == -1)
				throw new IllegalStateException();
			
			this.calificaciones.removeElementAt(i);
			return this;
		
		}

		private int buscarMatricula(String matricula) {
			if(matricula == null)
				throw new IllegalArgumentException();
			int mitad = 0;
			int inicio= 0;
			int fin = this.calificaciones.size()-1;
		
			String s = "";
			while(inicio <= fin){
				mitad = (inicio + fin)/2;
				s = this.calificaciones.get(mitad).matricula();
				if(s.compareTo(matricula) == 0)
					return mitad;
				else if (s.compareTo(matricula) < 0 )
					inicio = mitad +1;
				else
					fin= mitad -1;
			}
			return -1;
		}
		
		  public double notaMedia() {
			  if(this.calificaciones.size() == 0)
				  throw new IllegalStateException();
			  double sumnotas = 0;
			  for(int i = 0; i < this.calificaciones.size(); i++) {
				  sumnotas += this.calificaciones.get(i).nota();
			  }
			  return sumnotas / this.calificaciones.size();
		  }
		  

		  public IndexedList<Pair<String,Integer>> alumnosPorGrupo(){
			  IndexedList<Pair<String,Integer>> alumnosGrupo = new ArrayIndexedList<>();
			  
			  int i = 0;
			  for(; i < this.calificaciones.size(); i++) {
				   String grupo = this.calificaciones.get(i).grupo();
				   int cont = 1;
				   
				   boolean rep = false;
				   for(int k = 0; k<alumnosGrupo.size(); k++) {
				   
				       if(grupo.equals(alumnosGrupo.get(k).left()))
					     rep = true;
				   }
				   
				   if(!rep) {
					   
				       for (int j = i+1; j < this.calificaciones.size(); j++) {
				        	   
					       if(this.calificaciones.get(j).grupo().equals(grupo))
						        cont++;
				        }
				          
				         Pair<String,Integer> aux = new Pair<>(grupo,cont);
							 
						 alumnosGrupo.add(alumnosGrupo.size(), aux);
				   }
			  }
			 
			  return alumnosGrupo;
		  }

		  public IndexedList<Calificacion>
		    getCalificaciones(Function<Calificacion,Boolean> filter,
		                      Comparator<Calificacion> cmp){
			  
			 IndexedList<Calificacion> res = new ArrayIndexedList<>();
			 for(int i = 0; i < this.calificaciones.size(); i++) {
				 Calificacion cali = this.calificaciones.get(i);
				 if(filter.apply(cali) == true) 
					 res.add(res.size(),cali); 
			 }

			 if(cmp == null)
				 insertionSort1(res);
			  else 
				  insertionSort(res,cmp);
			  
			 return res;
		  }
	  

		  
		  private void insertionSort1(IndexedList<Calificacion> cali) {
			  for(int i = 1; i < cali.size(); i++) {
				  Calificacion cal = cali.get(i);
				  int j = i-1;
				  
				  while(j >= 0 && cali.get(j).matricula().compareTo(cal.matricula()) > 0) {
					  cali.set(j+1,cali.get(j));
					  j--;
				  }
				  cali.set(j+1,cal);
			  }
			  
		  }
		  
		  private void insertionSort(IndexedList<Calificacion> cali, Comparator<Calificacion> cmp) {
			  
			  for(int i = 1; i < cali.size(); i++) {
				  Calificacion cal = cali.get(i);
				  int j = i-1;
				  
				  while(j >= 0 && cmp.compare(cal, cali.get(j)) <= 0) {
					   cali.set(j+1,cali.get(j));
					  j--;
				  }
				  cali.set(j+1,cal);
			  }
			  
		  }
		  
		  
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj instanceof ActaNotasImpl p )
			return(this.asignatura.equals(p.asignatura) && this.anyo == p.anyo && this.esConvocatoriaExtraordinaria == p.esConvocatoriaExtraordinaria);
		 else
			return false;
	}
	

	public String toString() {
		 return "Acta("+
				    "\""+asignatura()+
				    "\",\""+anyo()+
				    "\",\""+esConvocatoriaExtraordinaria()+
				    ")";
	}
	
	
	
}
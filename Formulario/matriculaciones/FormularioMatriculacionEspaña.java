package matriculaciones;

import formularios.FormularioImpl;

public class FormularioMatriculacionEspa├▒a extends  
  FormularioMatriculacion  
{  
  public FormularioMatriculacionEspa├▒a(FormularioImpl implementacion)   
  { 
    super(implementacion);  
  } 
  
  protected boolean controlZona(String matricula)  
  {  
    return matricula.length() == 7;  
  }  
}

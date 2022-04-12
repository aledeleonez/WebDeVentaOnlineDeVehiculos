package matriculaciones;

import formularios.FormularioImpl;

public class FormularioMatriculacionPortugal extends FormularioMatriculacion {  
  
    public FormularioMatriculacionPortugal(FormularioImpl implementacion)  
  { 
    super(implementacion);  
  } 
  
  protected boolean controlZona(String matricula)  
  {  
    return matricula.length() == 6;  
  }  
}

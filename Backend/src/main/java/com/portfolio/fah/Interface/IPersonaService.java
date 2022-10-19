
package com.portfolio.fah.Interface;

import com.portfolio.fah.Entity.Persona;
import java.util.List;
import org.springframework.stereotype.Service;


public interface IPersonaService {
   public List<Persona> getPersona ();
   
   public void savePersona(Persona persona);
   
   public void deletePersona (Long id);
   
   public Persona findPersona (Long id);
}

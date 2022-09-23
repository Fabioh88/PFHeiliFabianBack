
package com.portfolio.fah.Service;

import com.portfolio.fah.Entity.Persona;
import com.portfolio.fah.Interface.IPersonaService;
import com.portfolio.fah.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonrepository;
    
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonrepository.findAll();
        return persona;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonrepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonrepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona= ipersonrepository.findById(id).orElse(null);
        return persona;
    }
    
}

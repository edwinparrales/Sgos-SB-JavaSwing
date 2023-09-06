/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epv.tecnologia.pos.servicios;

import epv.tecnologia.pos.modelos.Categoria;
import epv.tecnologia.pos.repositorio.CategoriaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service
public class CategoriaService {
    
    @Autowired
    CategoriaRepository categoriaRepository;
    
    public List<Categoria> listar(){
        
        return categoriaRepository.findAll();
    
    }
    
}

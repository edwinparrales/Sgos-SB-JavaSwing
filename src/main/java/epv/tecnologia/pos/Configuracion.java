/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epv.tecnologia.pos;

import epv.tecnologia.pos.vista.MainMDI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {
    
    @Bean(name = "MainMDI")
    public MainMDI getMainMDI(){
    
      return new MainMDI();
    }
    

    
}

package models;

import java.util.List;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
@Entity 
public class Cliente extends Model {
	 private static final long serialVersionUID = 1L;

		@Id
	    public Long id;
	    
	    @Constraints.Required
	    public String nombre;
	    @Constraints.Required
	    public String apellido;
	    @Constraints.Required
	    public String direccion;
	    @Constraints.Required
	    public String telefono;
	    
	    
	   public static Find<Long,Cliente> find = new Find<Long,Cliente>(){};
		public static List<Cliente> listadoCliente() {
			// TODO Auto-generated method stub
			return find.all();
		}
}

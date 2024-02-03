package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import daos.RolDao;
import daos.RolDaoImpl;
import model.Rol;

public class Prueba05 {

	public static void main(String[] args) {
		
		RolDao dao = new RolDaoImpl();
			
		// Rol rol = dao.find(9);
		
		//rol.setIdrol(1);
		//rol.setRolName("asistente");
		//rol.setRolStatus(1);
		
		dao.delete(8);
		
		List<Rol> rolList = dao.findAll(); 
		
		for(Rol r: rolList) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolName());
			System.out.println(r.getRolStatus());
		}

	}

}

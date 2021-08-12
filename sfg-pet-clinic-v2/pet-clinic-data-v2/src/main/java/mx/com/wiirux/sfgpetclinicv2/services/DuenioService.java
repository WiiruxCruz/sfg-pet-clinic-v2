package mx.com.wiirux.sfgpetclinicv2.services;

import mx.com.wiirux.sfgpetclinicv2.model.Duenio;

public interface DuenioService extends CrudService<Duenio, Long> {
	Duenio buscarPorApellido(String apellido);
	
}

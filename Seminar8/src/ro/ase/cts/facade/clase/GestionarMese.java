package ro.ase.cts.facade.clase;

 class GestionarMese {

	public boolean esteLibera(int cod) {
	if(cod>9) {
		return true;
	}
	return false;
}
}

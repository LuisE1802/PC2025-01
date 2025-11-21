package pe.edu.upc.pc2.services;

import pe.edu.upc.pc2.entities.Authority;

public interface AuthorityService {

    public Authority addAuthority(Authority authority);

    public Authority findByName(String authorityName);

}

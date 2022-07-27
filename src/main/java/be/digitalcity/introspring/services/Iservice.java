package be.digitalcity.introspring.services;

import java.util.List;

public interface Iservice<TENTITY, TDTO,TID> {
    List<TDTO> getAll();
    TDTO getById(TID id);
    TDTO insert(TENTITY entity);
    void update(TENTITY entity);
    void delete(TID id);

}

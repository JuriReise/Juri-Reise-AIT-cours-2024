package Houmwork_26.ait.warehouse.dao;

import Houmwork_26.ait.warehouse.model.Detail;

public interface Stock {
    boolean addDetail(Detail detail);
    Detail findDetailByBarCode(long barCode);
    boolean updateDetail(Detail detail);
    boolean removeDetail(long barCode);
    double totalWeight();
    double averageWeight();
}

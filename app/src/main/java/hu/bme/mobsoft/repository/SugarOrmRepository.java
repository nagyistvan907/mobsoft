package hu.bme.mobsoft.repository;

import android.content.Context;

import com.orm.SugarContext;
import com.orm.SugarDb;
import com.orm.SugarRecord;

import java.util.List;

import hu.bme.mobsoft.model.Shop;

/**
 * Created by Jester on 2017. 04. 21..
 */

public class SugarOrmRepository implements Repository {


    @Override
    public void open(Context context) {
        SugarContext.init(context);
    }

    @Override
    public void close() {
        SugarContext.terminate();
    }

    @Override
    public List<Shop> getShops() {
        return SugarRecord.listAll(Shop.class);
    }

    @Override
    public long createShop(Shop shop) {
        return SugarRecord.save(shop);
    }

    @Override
    public boolean modifyShop(Shop shop) {
        SugarRecord.save(shop);
        return true;
    }

    @Override
    public boolean deleteShop(Shop shop) {
        return SugarRecord.delete(shop);
    }

    @Override
    public boolean isInDB(Shop shop) {
        return SugarRecord.findById(Shop.class, shop.getId()) != null;
    }
}

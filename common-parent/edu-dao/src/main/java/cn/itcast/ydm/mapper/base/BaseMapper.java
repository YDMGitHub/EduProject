package cn.itcast.ydm.mapper.base;

import cn.itcast.ydm.model.User;

public interface BaseMapper<T> {
    public T findById(Integer id);
    public T findByUuid(String id);

    public void deleteById(Integer id);
    public void deleteByUuid(String id);

    public void insert(T t);

    public void update(T t);
}

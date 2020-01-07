package cn.itcast.ydm.service.base;

public interface IBaseService<T> {
    public T findById(Integer id);
    public T findByUuid(String id);

    public void deleteById(Integer id);
    public void deleteByUuid(String id);

    public void insert(T t);

    public void update(T t);
}

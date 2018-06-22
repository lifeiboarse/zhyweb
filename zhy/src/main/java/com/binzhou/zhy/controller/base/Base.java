package com.binzhou.zhy.controller.base;

public interface Base<T> {
    String getAllByOptions();
    String get();
    String update(T t);
    String deleteAll();
}

package com.ada.dao.core;

import java.util.List;

public interface DataDao {
void addObject(Object object);
void updateObject(Object object);
void deleteObject(Object object);
List findObject(String sql);
}

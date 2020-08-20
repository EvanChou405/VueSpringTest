package com.evan.wj.dao;

import com.evan.wj.pojo.AdminMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import com.evan.wj.pojo.AdminMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Evan
 * @date 2020/1/10
 */
public interface AdminMenuDAO extends JpaRepository<AdminMenu, Integer> {
    AdminMenu findById(int id);
    List<AdminMenu> findAllByParentId(int parentId);
}

package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteImgDao;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RouteImgDaoImpl implements RouteImgDao {

    private JdbcTemplate tem = new JdbcTemplate(JDBCUtils.getDataSource());

    public List<RouteImg> findById(int rid) {
        String sql = "select * from tab_route_img where rid = ?";
        List<RouteImg> list = tem.query(sql, new BeanPropertyRowMapper<RouteImg>(RouteImg.class), rid);
        return list;
    }
}

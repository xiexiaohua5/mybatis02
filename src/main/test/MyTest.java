import com.qf.hua.mybatis.entity.Order1;
import com.qf.hua.mybatis.entity.Roles;
import com.qf.hua.mybatis.mapper.Order1Mapper;
import com.qf.hua.mybatis.mapper.RolesMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
* 删除主表数据
* 从表数据如何处理 要么一起删除
* 哪怕是一对一也设计成一对多
* 表的关联最多是五张这样
* 太多表之间关联了就一张表一张表查
*
* 角色 权限的集合 admin user guest
*
* 权限表
*   论坛
*   管理员 删除帖子
*   普通用户 只能查看
*   权限 删除权限 查看权限 对记录的增删改查
*   权限表
*   name add 添加权限
*   del 删除权限
*   view 查看
*
*   多对多的时候 一定有第三张中间表
* */
public class MyTest {
    public static void main(String[] args) throws IOException {
        String mybatis = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(mybatis);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession(true);

        /*Order1Mapper mapper = sqlSession.getMapper(Order1Mapper.class);
        *//*
         * 一对一的查询
         * *//*
        Order1 order1 = mapper.selectOrderByOrderId(1);
        *//*
        * 一对一的保存
        * 映射关系 先保存主表获取的主表的ID 将主表的ID的值设置给从表的外键
        * 更新
        * 删除 假删除
        * *//*
        System.out.println(order1);

        List<Order1> order1s = mapper.selectOrderByUserId(1);
        System.out.println(order1);*/

        RolesMapper mapper = sqlSession.getMapper(RolesMapper.class);
        Roles roles = mapper.selectByUserId(1);
        System.out.println(roles);


    }
}

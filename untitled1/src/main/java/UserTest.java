import org.apache.ibatis.session.SqlSession;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class UserTest {
    private Dao dao;
    public String acc;

    public UserTest(String acc, String pwd) {
        this.acc = acc;
        this.pwd = pwd;
    }

    public String pwd;
    public int login(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("acc",acc);
        map.put("pwd",pwd);
         dao = sqlSession.getMapper(Dao.class);
        int x = dao.getUserList(map);
        System.out.println(x);
        sqlSession.close();
        return x;
    }
    public void signIn(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("acc",acc);
        map.put("pwd",pwd);
        dao = sqlSession.getMapper(Dao.class);
        int x =dao.setUserList(map);
        System.out.println(x);
        sqlSession.commit();
        sqlSession.close();
    }
}

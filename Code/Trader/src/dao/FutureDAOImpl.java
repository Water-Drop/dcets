package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import entity.BrokerInfo;
import entity.Future;

public class FutureDaoImpl implements FutureDao {
	private JDBCUtil jdbc = new JDBCUtil("dcetsT1");

	public void refreshFutures(){
		//String future_str = httpRequest.sendGet("http://59.78.3.25:8080/BrokerWebServer/services/getFuture", null);
		Connection conn = jdbc.getConnection();
		System.out.println("get>!");
		ResultSet rs = null;
		PreparedStatement pst = null;
		String sql = "";
		try {
			sql = "drop table if exists future;";
			pst = conn.prepareStatement(sql);
			pst.execute();
			sql = "create table future(id int primary key auto_increment,category varchar(255),name varchar(255),period varchar(80));";
			pst = conn.prepareStatement(sql);
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbc.close(conn, pst, rs);
		}
	}

	public List<Future> getAllFutures(int bid) {
		List<Future> futures = new ArrayList<Future>();
		BrokerDao bd = new BrokerDaoImpl();
		BrokerInfo broker = bd.getBrokerbyId(bid);

		String future_str = "";// HttpHelper.SendHttpRequest("get",
								// broker.getIp()+":8080/BrokerWebServer/services/getFuture",
								// null);

		return futures;
	}

	public int getFutureByNamePeriod(String name, String period) {
		int ans = 0;
		/*
		 * Connection conn = jdbc.getConnection(); String sql =
		 * "select * from originorder where tid=?;"; ResultSet rs = null;
		 * PreparedStatement pst = null; try { pst = conn.prepareStatement(sql);
		 * pst.setInt(1, tid); rs = pst.executeQuery(); while (rs.next()) {
		 * ans.add(new OriginOrder(rs.getInt("id"), rs.getInt("fid"), rs
		 * .getInt("tid"), rs.getInt("quantity"), rs .getInt("cumQtyl"),
		 * rs.getInt("leavesqty"), rs .getInt("price"), rs.getDate("d"),
		 * rs.getInt("status"))); } } catch (SQLException e) {
		 * e.printStackTrace(); } finally { jdbc.close(conn, pst, rs); }
		 */
		return ans;
	}

	public List<Integer> getFutureByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllFutureName() {
		// TODO Auto-generated method stub
		return null;
	}

}

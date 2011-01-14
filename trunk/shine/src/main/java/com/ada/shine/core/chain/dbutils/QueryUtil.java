package com.ada.shine.core.chain.dbutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbutils.ResultSetHandler;

public class QueryUtil {
	public <T> T query(Connection conn, String sql, ResultSetHandler<T> rsh,
			Object... params) throws SQLException {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		T result = null;

		try {
			stmt = this.prepareStatement(conn, sql);
			this.fillStatement(stmt, params);
			rs = stmt.executeQuery();
			result = rsh.handle(rs);

		} catch (SQLException e) {
			// this.rethrow(e, sql, params);

		} finally {
			try {
				// close(rs);
			} finally {
				// close(stmt);
			}
		}

		return result;
	}
	public <T> T query(Connection conn, String sql, ResultSetHandler<T> rsh) throws SQLException {

		Statement stmt = null;
		ResultSet rs = null;
		T result = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			result = rsh.handle(rs);

		} catch (SQLException e) {
			// this.rethrow(e, sql, params);

		} finally {
			try {
				conn.close();
			} finally {
				stmt.close();
			}
		}

		return result;
	}
	protected PreparedStatement prepareStatement(Connection conn, String sql)
			throws SQLException {

		return conn.prepareStatement(sql);
	}

	public void fillStatement(PreparedStatement stmt, Object... params)
			throws SQLException {

		if (params == null) {
			return;
		}

	}
}

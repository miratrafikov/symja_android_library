package org.matheclipse.core.expression.data;

import org.gavaghan.geodesy.GlobalPosition;
import org.matheclipse.core.expression.DataExpr;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IExpr;

public class GeoPositionExpr extends DataExpr<GlobalPosition> {

	private static final long serialVersionUID = -2913225354078252971L;

	/**
	 * 
	 * 
	 * @param value
	 * @return
	 */
	public static GeoPositionExpr newInstance(final GlobalPosition value) {
		return new GeoPositionExpr(value);
	}

	protected GeoPositionExpr(final GlobalPosition position) {
		super(F.GeoPosition, position);
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof GeoPositionExpr) {
			return fData.equals(((GeoPositionExpr) obj).fData);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (fData == null) ? 353 : 353 + fData.hashCode();
	}

	@Override
	public IExpr copy() {
		return new GeoPositionExpr(fData);
	}
}

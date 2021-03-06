/**
 * 
 */
package pl.plzspring.statistic;

import java.io.Serializable;

import pl.plzspring.statistic.enums.StatisticType;

/**
 * @author Administrator
 *
 */
public class StatisticDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private StatisticType type;

	public StatisticType getType() {
		return type;
	}

	public void setType(StatisticType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatisticDTO other = (StatisticDTO) obj;
		if (type != other.type)
			return false;
		return true;
	}

}

package com.celestial.lifetimes;

public interface PhasedComponent<T> extends Component
{

	void setPhase(T phase);
}

package com.mustardus.frog.logging;

import com.mustardus.frog.Model.Frog;
import com.mustardus.frog.Model.User;

public interface LogFormat {
	
	public String update(User user, Frog frog);

}

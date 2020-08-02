package com.techlab.account;

import java.time.LocalDateTime;

public interface Listener {
	LocalDateTime now = LocalDateTime.now();
	void update(AccountTransaction a, double amount);
}

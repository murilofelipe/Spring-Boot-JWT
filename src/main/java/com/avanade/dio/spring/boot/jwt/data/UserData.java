package com.avanade.dio.spring.boot.jwt.data;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserData implements Serializable{
	private String userName;
    private String password;
}

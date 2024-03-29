package com.atguigu06.project.team.service;

import com.atguigu06.project.team.domain.Employee;

/**
 * ClassName: TeamException
 * Package: com.atguigu06.project.team.service
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/5/005 下午 05:16
 * @Version 1.0
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -3387516998916542388L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}

package com.atguigu06.project.team.domain;

/**
 * ClassName: PC
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/4/004 下午 09:31
 * @Version 1.0
 */
public class PC implements Equipment{
    private String model;
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model+display;
    }
}

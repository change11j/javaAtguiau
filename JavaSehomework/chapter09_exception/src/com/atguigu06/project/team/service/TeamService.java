package com.atguigu06.project.team.service;

import com.atguigu06.project.team.domain.Architect;
import com.atguigu06.project.team.domain.Designer;
import com.atguigu06.project.team.domain.Employee;
import com.atguigu06.project.team.domain.Programmer;


import java.util.SimpleTimeZone;
import java.util.TooManyListenersException;

/**
 * ClassName: TeamService
 * Package: com.atguigu06.project.team.service
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/5/005 下午 06:06
 * @Version 1.0
 */
public class TeamService {
    private static int counter=1;
    private static final int MAX_MEMBER =5;
    private Programmer[] team=new Programmer[MAX_MEMBER];
    private int total=0;

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i]=this.team[i];
        }
        return team;
    }
    public void addMember(Employee e ) throws TeamException{
        //        成员已满，无法添加
        if(total>MAX_MEMBER){
            throw new TeamException("full");
        }
        //        该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)){
            throw new TeamException("this member is not programmer");
        }
        Programmer p = (Programmer) e;
        switch (p.getStatus()){
            //                该员工已是某团队成员
            case BUSY:
                throw new TeamException("this member has been in a team");
                //        该员工正在休假，无法添加
            case VOCATION:
                throw new TeamException("this member in on a vocation");
        }

        //                该员工已在本开发团队中
        if (isExist(p)){
            throw new TeamException("this member has been in this team");
        }
        int numOfArch=0, numOfDsgn=0,numOfPrg=0;
        for (int i = 0; i < total; i++) {
            if (p instanceof Architect){
                numOfArch++;
            }else if(p instanceof Designer){
                numOfDsgn++;
            }else if (p instanceof Programmer){
                numOfPrg++;
            }
        }
        //        团队中至多只能有一名架构师
        if(p instanceof Architect){
            if (numOfArch>1){
                throw new TeamException("only one Architect in a team is allowed");
            }
        //                团队中至多只能有两名设计师
        }else if(p instanceof Designer){
            if (numOfDsgn>2){
                throw new TeamException("only two designer in a team is allowed");
            }
        //        团队中至多只能有三名程序员
        }else if (p instanceof Programmer){
            if(numOfPrg>3){
                throw new TeamException("only three programmer in a team is allowed");
            }
        }
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
        team[total++]=p;
    }
    public void removeMember(int memberId)throws TeamException{
        int i = 0;
        for (; i < total; i++) {
            if(team[i].getMemberId()==memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if(i==total){
            throw new TeamException("can't find member");
        }
        for (int j = i+1; j < total; j++) {
            team[i-1]=team[i];
        }
        team[--total]=null;
    }
    public boolean isExist(Programmer p){
        for (int i = 0; i < total; i++) {
            if (p.getId()==team[i].getId()){
                return true;
            }
        }
        return false;
    }
}

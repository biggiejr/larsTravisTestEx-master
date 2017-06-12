/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import exercise.realdatabase.UserFacadeRealDB;

/**
 *
 * @author Ben
 */
public class UserFacadeTestIT extends UserFacadeTest{
    @Override
    public IUserFacade makeUserFacade(){
        if(System.getenv("TRAVIS") != null){
            return new UserFacadeRealDB("pu_mySql_travis_Integration");
        }
        return new UserFacadeRealDB("pu_localDB");
    }
}

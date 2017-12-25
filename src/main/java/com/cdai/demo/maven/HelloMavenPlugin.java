package com.cdai.demo.maven;


import org.apache.maven.plugin.AbstractMojo;

import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugin.MojoFailureException;
/**

        * Maven插件的Helloworld

        * User: cdai

        *

        * @goal info

        * @phase compile

        * @requiresProject false

        */


public class HelloMavenPlugin extends AbstractMojo {



    /**

     * @parameter expression="${greeting}" default-value="Helloworld!!!"

     */

    String greeting;



    @Override

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("running...");
        getLog().info(greeting+"songjiantao++++");

    }



}
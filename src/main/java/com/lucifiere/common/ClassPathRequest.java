package com.lucifiere.common;

/**
 * 类路径扫描工具
 *
 * @author XD.Wang
 * Date 2020-8-2.
 */
public class ClassPathRequest {

    /**
     * 包路径
     */
    private String[] classPackages;

    /**
     * Instantiates a new Class path request.
     *
     * @param classPackages the class packages
     */
    public ClassPathRequest(String[] classPackages) {
        this.classPackages = classPackages;
    }

    /**
     * Instantiates a new Class path request.
     *
     * @param classpath the classpath
     */
    public ClassPathRequest(String classpath) {
        this.classPackages = new String[] {classpath};
    }

    /**
     * Gets classPackages
     *
     * @return the classPackages
     */
    public String[] getClassPackages() {
        return classPackages;
    }

    /**
     * Sets classPackages
     *
     * @param classPackages the classPackages
     */
    public void setClassPackages(String[] classPackages) {
        this.classPackages = classPackages;
    }
}

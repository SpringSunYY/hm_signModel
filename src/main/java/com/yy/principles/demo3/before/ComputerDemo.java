package com.yy.principles.demo3.before;

/**
 * @Project: design_patterns
 * @Package: com.yy.principles.demo3.before
 * @Author: YY
 * @CreateTime: 2024-08-15  14:44
 * @Description: ComputerDemo
 * @Version: 1.0
 */
public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setHardDisk(new XiJieHardDisk());
        computer.setCpu(new IntelCpu());
        computer.setMemory(new KingstonMemory());

        computer.run();
    }
}

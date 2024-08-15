package com.yy.principles.demo3.after;


/**
 * @Project: design_patterns
 * @Package: com.yy.principles.demo3.after
 * @Author: YY
 * @CreateTime: 2024-08-15  14:53
 * @Description: ComputerDemo
 * @Version: 1.0
 */
public class ComputerDemo {
    public static void main(String[] args) {

        //创建计算机的组件对象
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new AmdCpu();
        Memory memory = new KingstonMemory();

        //创建计算机对象
        Computer c = new Computer();
        //组装计算机
        c.setCpu(cpu);
        c.setHardDisk(hardDisk);
        c.setMemory(memory);

        //运行计算机
        c.run();
    }
}

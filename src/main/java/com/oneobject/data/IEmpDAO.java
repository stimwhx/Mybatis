package com.oneobject.data;

import com.oneobject.vo.Emp;

public interface IEmpDAO {
    /**
     *
     * @param ov 要添加的对象，添加到数据库里的对象
     * @return 添加成功返回true,否则返回false
     * @throws Exception 会抛sql执行异常
     */
    public boolean doAdd(Emp ov)throws Exception;

    /**
     *
     * @param ov 修改对象，要提供id
     * @return
     * @throws Exception
     */
    public boolean doUpdata(Emp ov) throws Exception;
}

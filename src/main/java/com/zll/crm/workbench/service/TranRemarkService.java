package com.zll.crm.workbench.service;

import com.zll.crm.workbench.domain.TranRemark;

import java.util.List;

public interface TranRemarkService {
    List<TranRemark> queryTranRemarkForDetailByTranId(String id);

    int saveCreateTranRemark(TranRemark tranRemark);

    int deleteTranRemarkById(String id);

    int saveEditTranRemark(TranRemark tranRemark);
}

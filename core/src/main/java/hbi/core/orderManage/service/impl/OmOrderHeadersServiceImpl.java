package hbi.core.orderManage.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import hbi.core.orderManage.dto.OmOrderHeaders;
import hbi.core.orderManage.service.IOmOrderHeadersService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OmOrderHeadersServiceImpl extends BaseServiceImpl<OmOrderHeaders> implements IOmOrderHeadersService{

}
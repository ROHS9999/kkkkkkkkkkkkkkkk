package com.opentravelsoft.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opentravelsoft.entity.Express;
import com.opentravelsoft.entity.Plan;
import com.opentravelsoft.providers.ExpressDao;
import com.opentravelsoft.providers.PlanDao;
import com.opentravelsoft.providers.mixed.PlanListDao;
import com.opentravelsoft.workflow.TaskDao;

@Service("MyPageService")
public class MyPageServiceImpl implements MyPageService {

  @Autowired
  private ExpressDao expressDao;

  @Autowired
  private PlanListDao planListDao;

  @Autowired
  private PlanDao tourDao;

  @Autowired
  private TaskDao taskService;

  public List<Express> roGetExpressTask(String taskName) {
    return expressDao.getExpressTaskList(taskName);
  }

  public List<Plan> roGetPlanList(long teamId, long userId) {
    return planListDao.getRunPlans(teamId, userId);
  }

  public List<Plan> roGetTours(long teamId, long userId, String lineName,
      Date startDate, Date endDate) {
    return tourDao.getTours(teamId, userId, lineName, startDate, endDate);
  }

}

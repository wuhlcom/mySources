package thread.threadPool.producerConsumer.CountDownLatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class UseThreadPool {

    private List<Person> multiThreadProcData(List<Person> deviceList, int type, String messageId, Integer unitId) {
        // 自增1 expire 方法设置过期时间
        ThreadPoolTool<Person> threadPoolTool = new ThreadPoolTool<>(2, deviceList);
        threadPoolTool.setCallBack(new ThreadPoolTool.CallBack<Person>() {
            @Override
            public Object method(List<Person> list) {
                try {
                    //存在失败，则不再继续新的操作


                    switch (type) {
                        case -1:
//                            for (PubDevice data : list) {
//                                checkLineData(messageId, data);
//                                operations.increment(incrementKey, -1);
//                            }
//                            break;
                        case 0:
                            for (Person data : list) {
//                                PubDevice oldEntity = getOne(new QueryWrapper<PubDevice>().select("id").eq("number", data.getNumber()).eq("unit_id", unitId));
//                                if (null != oldEntity) {
//                                    data.setId(oldEntity.getId());
//                                }
//                                operations.increment(incrementKey, -1);
                            }
                            break;
                        case 1:
                            if (null != list && !list.isEmpty()) {
//                                saveBatch(list);
//                                for (PubDevice pubDevice : list) {
//                                    String videoIds = pubDevice.getVideoId();
//                                    if (StringUtils.isNotBlank(videoIds)) {
//                                        String[] videoIdArray = videoIds.split(";");
//                                        for (String videoId : videoIdArray) {
//                                            DeviceVideoRelation relations = new DeviceVideoRelation();
//                                            relations.setDeviceId(pubDevice.getId());
//                                            relations.setVideoId(Integer.valueOf(videoId));
//                                            deviceVideoRelationMapper.insert(relations);
//                                        }
//                                    }
//                                }
                            }
                            break;
                        case 2:
                            if (null != list && !list.isEmpty()) {
//                                for (PubDevice pubDevice : list) {
//                                    String videoIds = pubDevice.getVideoId();
//                                    if (StringUtils.isNotBlank(videoIds)) {
//                                        String[] videoIdArray = videoIds.split(";");
//                                        for (String videoId : videoIdArray) {
//                                            DeviceVideoRelation relations = new DeviceVideoRelation();
//                                            relations.setDeviceId(pubDevice.getId());
//                                            relations.setVideoId(Integer.valueOf(videoId));
//                                            Integer count = deviceVideoRelationMapper.selectCount(Wrappers.lambdaQuery(relations));
//                                            if (count.intValue() == 0) {
//                                                deviceVideoRelationMapper.insert(relations);
//                                            }
//                                        }
//                                    }
//                                }
                            }
                            break;
                    }
                } catch (
                        Exception e) {
//                    logger.error("线程运行异常1：" + e.getMessage(), e);

                }
                return list;
            }
        });
        try {
            List<Future<Object>> futureList = threadPoolTool.excute();
            List<Person> allList = new ArrayList<>();
            //对各个线程段结果进行解析
            for (Future<Object> future : futureList) {
                List<Person> list;
                if (null != future) {
                    try {
                        if (null == future.get()) {
//                            logger.error("数据处理失败！");
                            break;
                        }
                        list = (List<Person>) future.get();
                        allList.addAll(list);
                    } catch (Exception e) {
//                        logger.error("线程运行异常2：" + e.getMessage(), e);
//                        setProgressInfo(messageId, "数据导入失败，数据处理异常：" + e.getMessage(), 70, false);
                    }
                } else {
//                    logger.error("线程运行异常！");
//                    setProgressInfo(messageId, "数据导入失败，数据处理异常！", 70, false);
                }
            }
            return allList;
        } catch (
                Exception e) {
//            logger.error("线程运行异常3：" + e.getMessage(), e);

        }
        return null;
    }
}

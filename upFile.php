<?php

header('content-type:text/html;charset=utf-8');
date_default_timezone_set('Asia/Shanghai');

$file = $_FILES['pic'];
$name = $file['name'];
$size = $file['size'];
$type = strtolower(substr($name,strrpos($name, '.') + 1));
$allow_type = ['jpg', 'jpeg', 'png', 'gif'];
// 判断文件类型
if (!in_array($type, $allow_type))
  exit(json_encode(['status'=>0,'message'=>'文件类型错误']));
// 判断文件大小
if ($size > 10 * 1024 * 1024)
  exit(json_encode(['status'=>1,'message'=>'文件太大','size'=>$size]));
// 生成名字
$new_name;
for ($i = 0; $i < 10;$i++) {
  $new_name = date('YmdHi'). rand(1111,9999) . '.' . $type;
  $dd = opendir('./image/');
  $is_true = false;
  while($f = readdir($dd)){
    if ($f === $new_name) {
      $is_true = true;
      break;
    };
  }
  if ($is_true) break;
}
$up_file = move_uploaded_file($file['tmp_name'], './image/'.$new_name);

if ($up_file) die(json_encode(['status'=>200,'message'=>'上传成功','data'=>$_SERVER['HTTP_HOST'].'/index/image/'.$new_name]));
else die(json_encode(['status'=>1,'message'=>'上传失败']));
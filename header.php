<?php
define('IN_PHP', true);
//very very basic security
include('util.php');
include('functions.php');
session_start(); 
xmysql_connect();

//these next lines are optional
//they provide unique page titles
url = _SERVER['REQUEST_URI'];
pages = Array(
    "/about.php" => "&raquo; About",
    "/blah.php" => "&raquo; Blah",
    "/blah2.php" => "&raquo; Blah 2"
);
title = pages[url];
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<link rel="stylesheet" type="text/css" media="screen" href="style.css"/>

<head>
   <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
   <title>My First Web App  <?php echo title; ?></title>
</head>
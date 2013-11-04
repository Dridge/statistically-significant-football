[code lang="PHP"]< ?php if( !defined('IN_PHP') ) {

die("hacking attempt");
} function xmysql_connect() {

global mysql_host, mysql_user, mysql_pass, mysql_db;
@mysql_connect(msql_host, mysql_user, mysql_pass) or die('Could not connect to database: ' . mysql_error());
mysql_select_db(mysql_db) or die('Could not select database: ' . mysql_error());
} ?>[/code]
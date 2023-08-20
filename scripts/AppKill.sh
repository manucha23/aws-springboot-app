jPid=( $(pidof java) );

echo $jPid;

if [ $jPid != null ]; then
  kill -9 jPid;
fi
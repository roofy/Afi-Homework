int allTrue(bool [] E) {
if (E.length < 1) {
return -1;
}
int m = E.length;
int i = 0;
while (i < E.length) {
if (E[i] == false) {
return 0;
}
i = i + 1;
}
return 1;
}
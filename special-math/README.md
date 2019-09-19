Special Math
============

Run
---

__Execute:__

```bash
$ sbt "run <integer_here>"
```

Original
--------

__Original Python implementation:__

```python
import sys

def specialMath(n):
	if(n==0):
		return 0
	elif(n==1):
		return 1
	return n + specialMath(n-1)	+ specialMath(n-2)

print specialMath(int(sys.argv[1]))
```

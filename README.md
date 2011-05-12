## FPHP ##

A small language that adds some syntactic sugar to PHP.  It is still a work in progress, the entirety of PHP isn't implemented and syntax etc. may change with limited notice so serious usage is discouraged at the current time.

### Usage ###

#### Functions ####

Defining functions is done in the following way:
<pre>
add->($argument1, $argument2)
	return $argument1 + $argument2
</pre>

This would transform into the following PHP:
<pre>
function add($argument1, $argument2){
	return $argument1 + $argument2;
}	
</pre>

As you may notice the curly braces are omitted in a style similar to that of python.  This means that indentation is very important; compilation errors will be thrown or incorrect output generated if indentation levels are wrong.

Functions can be called in the following way:

<pre>
add(1,2)	
</pre>

#### Objects ####

Objects are implemented syntactically in a way that is largely similar to the way they are implemented in regular PHP (making this one of the areas of syntax most prone to change).  To create the following PHP:

<pre>
class TestClass {
	
	function testFunction(){
		...
	}
	
}	
</pre>

You would do the following:
<pre>
class TestClass
	testFunction->()
		...
</pre>

Objects are quite loosely implemented to the extent that you will be able to enter code that will cause PHP to error (e.g. you can current do $a = $b + 2; anywhere in a class, including outside functions) so care should be taken.

#### Arrays ####

Arrays can be declared like this:
<pre>
	$a = {1,2,3,4}
</pre>
and referenced like this:
<pre>
	$a{:0}
</pre>
which would give the output "1"

#### Loops ####

The foreach loop is implemented in the following way:
<pre>
	$a = {1,2,3,4}
	$total = 0
	$a.each
		$total = $total + $value
</pre>
Which will generate the following PHP code:
<pre>
	$a = new array(1,2,3,4);
	$total = 0;
	if (!empty($a)){
		foreach ($a as $key=>$value){
			$total = $total + $value;
		}
	}
</pre>

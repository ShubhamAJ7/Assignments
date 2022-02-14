//////////////////////////////////
Start Insertionsort
take first ELEMENT as sorted ELEMENT
Compare the current element (key) to its predecessor. 
If the key element is smaller than its predecessor, compare it to the elements before. 
Move the greater elements one position up to make space for the swapped element
/////////////////////////
Take first element as pivot
low Starting index,  high Ending index
quickSort(arr[], low, high)
if (low < high)
 pi = partition(arr, low, high);
 quickSort(arr, low, pi - 1);  // Before pi
 quickSort(arr, pi + 1, high); // After pi
end if
end quick sort
///////////////////////////////
BEGIN BUBBLE SORT
FOR ALL ARRAY ELEMENT
IF ARR[i]>ARR[i++]
swap (arr[i],arr[i+1])
end IF
end for
return arrr
end bubble sort

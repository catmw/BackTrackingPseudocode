/* 
function routePacket(fabric, start, goal):
rows = number of rows in fabric
cols = number of columns in fabric

visited = 2D array initialised to false

if backtrack(start.row, start.col):
    return true //valid route found
else 
    return false //no valid route

function backtrack(row, col):
    if (row, col) doesnt exist in fabric:
        return false

    if visited(row, col) is true:
        return false

    if (row, col) is 503:
        return false

    if (row, col) is goal:
            return true

    //mark the cell as visited
    mark visited(row, col) true



    //move in the fabric

    //up 
    if backtrack(row - 1,col):   
        return true 
    //down
    if backtrack(row + 1,col):
        return true

    //right
    if backtrack(row, col+1):
        return true
    //left
    if backtrack(row, col- 1):
        return true
       
 */
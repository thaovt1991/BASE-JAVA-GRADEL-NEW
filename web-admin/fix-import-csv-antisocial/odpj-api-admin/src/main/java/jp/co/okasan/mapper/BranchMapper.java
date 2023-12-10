package jp.co.okasan.mapper;

import jp.co.okasan.domain.dto.BranchDTO;
import jp.co.okasan.entity.Branch;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BranchMapper {

    BranchDTO toBranchDto(Branch branch);
}
